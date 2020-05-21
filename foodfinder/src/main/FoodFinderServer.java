package main;

import java.io.IOException;

import io.grpc.BindableService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import javagrpc.foodSupplierGrpc;
import javagrpc.foodSupplierGrpc.foodSupplierBlockingStub;
import javagrpc.foodVendorGrpc;
import javagrpc.foodVendorGrpc.foodVendorBlockingStub;
import service.FoodFinderService;

public class FoodFinderServer
{
    private static final String ADDRESS = "localhost";

    private static final int FINDER_PORT = 9292;

    private static final int VENDOR_PORT = 9090;

    private static final int SUPPLIER_PORT = 9191;

    public static void main(String[] args) throws IOException, InterruptedException
    {
        ManagedChannel supplierChannel = 
            ManagedChannelBuilder.forAddress(ADDRESS, SUPPLIER_PORT).build();
        foodSupplierBlockingStub supplierStub = foodSupplierGrpc.newBlockingStub(supplierChannel);

        ManagedChannel vendorChannel = ManagedChannelBuilder.forAddress(ADDRESS, VENDOR_PORT).build();
        foodVendorBlockingStub vendorStub = foodVendorGrpc.newBlockingStub(vendorChannel);

        BindableService foodFinderService = new FoodFinderService(supplierStub, vendorStub);
        Server server = ServerBuilder.forPort(FINDER_PORT).addService(foodFinderService).build();

        server.start();

        System.out.println("FoodFinderService started at " + server.getPort());
        System.out.println(java.util.Calendar.getInstance().getTime());

        server.awaitTermination();
    }

}
