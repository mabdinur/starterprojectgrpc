package main;

import java.io.IOException;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.FoodVendorService;

public class FoodVendorServer
{
    private static final int PORT = 9090;

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BindableService foodVendorService = new FoodVendorService();
        Server server = ServerBuilder.forPort(PORT).addService(foodVendorService).build();

        server.start();

        System.out.println("FoodVendorService started at " + server.getPort());
        System.out.println(java.util.Calendar.getInstance().getTime());

        server.awaitTermination();
    }

}
