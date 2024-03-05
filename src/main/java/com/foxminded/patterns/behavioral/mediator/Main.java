package com.foxminded.patterns.behavioral.mediator;

import com.foxminded.patterns.behavioral.mediator.concierge.CallTaxiService;
import com.foxminded.patterns.behavioral.mediator.concierge.ConciergeService;
import com.foxminded.patterns.behavioral.mediator.concierge.FlowerDeliveryService;
import com.foxminded.patterns.behavioral.mediator.concierge.MaintenanceService;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ConciergeService taxi = new CallTaxiService();
    ConciergeService flower = new FlowerDeliveryService();
    ConciergeService maintenance = new MaintenanceService();
    List<ConciergeService> concierge = new ArrayList<>();
    concierge.add(taxi);
    concierge.add(flower);
    concierge.add(maintenance);
    concierge.forEach(s -> s.serve());
    System.out.println();
    System.out.println("Before notify isInProcess status:");
    concierge.forEach(s -> System.out.println(s.isInProcess()));
    System.out.println();
    ConciergeMediator mediator = new ConciergeMediatorImpl();
    concierge = mediator.notify(flower, concierge);
    System.out.println("After notify isInProcess status:");
    concierge.forEach(s -> System.out.println(s.isInProcess()));
  }
}
