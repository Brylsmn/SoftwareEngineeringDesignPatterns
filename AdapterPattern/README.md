# Plugging Devices into Power Outlets
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

  Adaptee Objects:

  Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

  Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

  SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

  Target Object:

  PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

  Adapter Objects:

  LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().
  
  RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
  
  SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().
  
# UML Class Diagram
![Alt text](https://scontent.fcrk4-1.fna.fbcdn.net/v/t1.15752-9/373473878_399545572400303_6400246160381913644_n.png?_nc_cat=108&ccb=1-7&_nc_sid=8cd0a2&_nc_eui2=AeFvjb-KEdjKqIAG3All0AdAsShOxl1aVvCxKE7GXVpW8GcefrQARbv_Rc2ybsiQfziHBZRNOowyywP2rvLVhgeZ&_nc_ohc=XDCBUEpxUB0AX_80tnS&_nc_ht=scontent.fcrk4-1.fna&oh=03_AdRa8ltsQ6tNyjpGHFcF2b-zUVA5RjWpEorewInAV0akxQ&oe=65700352)

