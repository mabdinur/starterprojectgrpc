package main;

import java.io.IOException;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.FoodSupplierService;

public class FoodSupplierServer
{

    private static final int PORT = 9191;

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BindableService foodsupplierService = new FoodSupplierService();
        Server server = ServerBuilder.forPort(PORT).addService(foodsupplierService).build();

        server.start();

        System.out.println("FoodSupplierService started at " + server.getPort());
        System.out.println(java.util.Calendar.getInstance().getTime());
        server.awaitTermination();
    }

}
