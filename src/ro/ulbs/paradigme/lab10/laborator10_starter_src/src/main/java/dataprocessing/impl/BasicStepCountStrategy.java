package ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.impl;

import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage.DataRepository;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy
{
    private final DataRepository dataRepository;

    public BasicStepCountStrategy(DataRepository dataRepository)
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
        return dataRepository.getRecords().stream()
                .mapToInt(SensorData::getStepsCount)
                .sum();
    }

    @Override
    public String getStrategyDescription()
    {
        return "Basic Step Count Strategy";
    }
}
