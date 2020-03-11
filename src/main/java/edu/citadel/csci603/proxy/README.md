# Proxy Design Pattern

## Overview

This is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls 
access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## How To Implement

1. If there’s no pre-existing service interface, create one to make proxy and service objects interchangeable. Extracting the 
interface from the service class isn’t always possible, because you’d need to change all of the service’s clients to use that interface. 
Plan B is to make the proxy a subclass of the service class, and this way it’ll inherit the interface of the service.

1. Create the proxy class. It should have a field for storing a reference to the service. Usually, proxies create and manage 
the whole life cycle of their servers. In rare occasions, a service is passed to the proxy via a constructor by the client.

1. Implement the proxy methods according to their purposes. In most cases, after doing some work, the proxy should delegate 
the work to the service object.

1. Consider introducing a creation method that decides whether the client gets a proxy or a real service. This can be a 
simple static method in the proxy class or a full-blown factory method.

1. Consider implementing lazy initialization for the service object.

![Facade Design Pattern UML](../../../../../../../images/patterns/proxy.png)

## Resources

* [https://en.wikipedia.org/wiki/Proxy_pattern](https://en.wikipedia.org/wiki/Proxy_pattern)
* [https://www.geeksforgeeks.org/proxy-design-pattern/](https://www.geeksforgeeks.org/proxy-design-pattern/)
* [https://refactoring.guru/design-patterns/proxy](https://refactoring.guru/design-patterns/proxy)