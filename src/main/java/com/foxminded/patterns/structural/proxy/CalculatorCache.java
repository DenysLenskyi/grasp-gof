package com.foxminded.patterns.structural.proxy;

import com.foxminded.patterns.structural.facade.CalculatorFacade;
import com.foxminded.patterns.structural.facade.CalculatorFacadeImpl;
import com.foxminded.patterns.structural.proxy.model.OperationArguments;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/** This class is a part of Proxy GoF pattern */
public class CalculatorCache implements CalculatorProxy {

  private Map<OperationArguments, Integer> cache = new HashMap<>();
  private CalculatorFacade calculatorFacade;

  @Override
  public int calculate(int a, int b, String operationName) {
    return calculateFromCache(new OperationArguments(a, b, operationName));
  }

  private int calculateFromCache(OperationArguments args) {
    AtomicInteger result = new AtomicInteger();
    Optional.ofNullable(cache.get(args))
        .ifPresentOrElse(
            value -> {
              result.set(cache.get(args));
              System.out.println("The result has been fetched from the cache");
            },
            () -> {
              calculatorFacade = new CalculatorFacadeImpl();
              result.set(
                  calculatorFacade.calculate(args.getA(), args.getB(), args.getOperationName()));
              cache.put(args, result.get());
            });

    return result.get();
  }

}
