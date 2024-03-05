package com.foxminded.patterns.behavioral.mediator;

import com.foxminded.patterns.behavioral.mediator.concierge.ConciergeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConciergeMediatorImpl implements ConciergeMediator {

  @Override
  public List<ConciergeService> notify(
      ConciergeService activeService, List<ConciergeService> services) {
    List<ConciergeService> output =
        services.stream()
            .filter(s -> s != activeService)
            .collect(Collectors.toCollection(ArrayList::new));
    output.forEach(s -> s.setInProcess(false));
    output.add(activeService);
    return output;
  }
}
