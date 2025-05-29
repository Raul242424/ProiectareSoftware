package ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.main;

import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.impl.BasicStepCountStrategy;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.dataprocessing.impl.FilteredStepCountStrategy;
import ro.ulbs.paradigme.lab10.laborator10_starter_src.src.main.java.storage.DataRepository;

public class Utils
{
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId()
    {
        return 42;
    }

    public static StepCountStrategy getStrategy(String type)
    {
        DataRepository dataRepository = DataRepository.getInstance();

        if (BASIC_STRATEGY.equalsIgnoreCase(type))
        {
            return new BasicStepCountStrategy(dataRepository);
        }
        else if (FILTERED_STRATEGY.equalsIgnoreCase(type))
        {
            return new FilteredStepCountStrategy(dataRepository);
        }
        else
        {
            throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }
}
