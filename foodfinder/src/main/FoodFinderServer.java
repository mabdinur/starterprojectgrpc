package main;

import java.io.IOException;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.FoodFinderService;

public class FoodFinderServer
{
    private static final int PORT = 9292;

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BindableService foodFinderService = new FoodFinderService();
        Server server = ServerBuilder.forPort(PORT).addService(foodFinderService).build();

        server.start();

        System.out.println("FoodFinderService started at " + server.getPort());
        System.out.println(java.util.Calendar.getInstance().getTime());

        server.awaitTermination();
    }

}
