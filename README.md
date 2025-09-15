# grpc-understand-protobuf

A Java Maven project for learning and demonstrating Protocol Buffers and gRPC concepts. This repository contains multiple examples showing how to define, use, and compose Protocol Buffers in Java applications, including basic serialization, composition, collections, and a simple gRPC bank service.

## Features

- Protocol Buffers (`.proto` files) for data serialization
- Java code generation from `.proto` definitions
- Example applications for:
  - Simple message serialization
  - Message composition
  - Collections in messages
  - gRPC service implementation (Bank Service)
- Organized by example for easy exploration

## Project Structure

```
pom.xml
src/
  main/
    java/
      org/amadeus/nxitech/common/GrpcServer.java
      org/amadeus/nxitech/example01/SimpleProtoDemo.java
      org/amadeus/nxitech/example02/CompositionProtoDemo.java
      org/amadeus/nxitech/example03/CollectionProtoDemo.java
      org/amadeus/nxitech/example04/BankService.java
      org/amadeus/nxitech/example04/repository/AccountRepository.java
    proto/
      example01/person.proto
      example02/composition.proto
      example03/collection.proto
      example04/bank-service.proto
    resources/logback.xml
  test/java/
```

## Getting Started

1. **Install prerequisites:**
   - Java 21
   - Maven
   - Protocol Buffers compiler (`protoc`)

2. **Build the project:**
   ```sh
   mvn clean compile
   ```

3. **Generate Java classes from `.proto` files:**
   Ensure the protobuf Maven plugin is configured in your `pom.xml`. The build will generate Java classes automatically.

4. **Run examples:**
   Use your IDE or Maven to run the example classes in `org.amadeus.nxitech.example01`, `example02`, `example03`, and `example04`.

## Examples

- **Example 01:** Simple message serialization (`person.proto`)
- **Example 02:** Message composition (`composition.proto`)
- **Example 03:** Collections in messages (`collection.proto`)
- **Example 04:** gRPC Bank Service (`bank-service.proto`)

## Logging

- Logging is configured via `src/main/resources/logback.xml`.

## License

MIT

