package org.amadeus.nxitech.common;

import io.grpc.ServerBuilder;
import org.amadeus.nxitech.example04.BankService;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        var server = ServerBuilder.forPort(6565)
                .addService(new BankService())
                .build();
        server.start();

        server.awaitTermination();
    }
}
