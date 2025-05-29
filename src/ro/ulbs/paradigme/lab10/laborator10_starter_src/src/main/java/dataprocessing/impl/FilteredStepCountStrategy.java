package ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.impl;

import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage.DataRepository;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage.SensorData;

import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy
{
    private final DataRepository dataRepository;

    public FilteredStepCountStrategy(DataRepository dataRepository)
    {
        this.dataRepository = dataRepository;
    }

    @Override
    public void consumeMessage(SensorData sample)
    {

    }

    @Override
    public int getTotalSteps()
    {
        List<SensorData> allData = dataRepository.getRecords();
        int totalSteps = 0;

        for (SensorData current : allData)
        {
            int currentSteps = current.getStepsCount();
            long currentTimestamp = current.getTimestamp();

            if (currentSteps <= 0) {
                continue;
            }

            int stepsInLastMinute = allData.stream()
                    .filter(other -> other.getTimestamp() < currentTimestamp
                            && other.getTimestamp() >= currentTimestamp - 60_000)
                    .mapToInt(SensorData::getStepsCount)
                    .sum();

            if (stepsInLastMinute <= 1000)
            {
                totalSteps += currentSteps;
            }
        }

        return totalSteps;
    }

    @Override
    public String getStrategyDescription()
    {
        return "Filtered Step Count Strategy";
    }
}
