Gang of Four Design Patterns
============================

Edited by Senthil
Creational Patterns
-------------------------

1.Factory Method -- Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. Clients does't have to get tied to the actual implementation

compoenents, 1. Abstract Creator -- has actual factory method..(interface/abstract class) 2. concreate Creator ... can take parameters,configs, based on that return one of products or create diff concrete cretor ech one for one ptroduct or use somekindof registry or mapping 3. Abstract product 4. concreteProduct

Examples,... Specified by architecture, implemented by user Examples: java.util.Calendar, java.util.ResourceBundle, java.text.NumberFormat

2.Abstract Factory
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.Implemented with a Factory, Hides the Factory, Abstracts Environment, Build through Composition Short definition: Factory of factories
 
 Examples,javax.xml.parsers.DocumentBuilderFactory
 > a system should be independent of how its products are created, composed, and represented.
 > a system should be configured with one of multiple families of products.
 > a family of related product objects is designed to be used together, and you need to enforce this constraint.
 > you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
 
 Participants : AbstractFactory,Concretefactory,AbstractProduct,ConcreteProduct,client
 
 3.Builder Patter
     Separate the construction of a complex object from its representation so that the same constructionprocess can create different representation.
     use the builder pattern,
       > the algorithm for creating complex object should be independent of the parts that make up the object and how they are assembled..move construction logic away from the constructor.. too many arguments
       > construction process must allow for differnt representation
       > immutable ob j once an object is constructed we do not want it to be changed
       Example.. StringBuilder,
 
 4. Prototype
    Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. 
    use when creation of prouct is complexy and expensive(like reading from db and constructing it) copy an existing instance
    and modify it.
    when to use,
    >>when the classes to instantiate are specified at run-time, for example, by dynamic loading; or
     >> to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
     >>when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
 
 
 5.Singleton Pattern
    There must be exactly one instance of class, it must be accessible to clients froma well known access point.
    
   Usually lazily loaded Example: java.lang.Runtime, Spring beans with Singleton scope

