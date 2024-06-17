class Camera {
    String brand, model, resolution;
    double price;
    String zoomCapacity;

    Lens lens = new Lens("50", "Zoom Lens", "20MP", "Sony");

    Camera(String brand, String model, String resolution, double price, String zoomCapacity) {
        this.brand=brand;
        this.model= model;
        this.resolution=resolution;
        this.price=price;
        this.zoomCapacity=zoomCapacity;
    }

    void displayCamera() {
        System.out.println("***Camera *****");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Price: " + price);
        System.out.println("Zoom Capacity: " + zoomCapacity);
    }
}

class Lens {
    String focalLength, lensType, aperture;
    String manufacturer;

    Lens(String focalLength, String lensType, String aperture, String manufacturer) {
        this.focalLength=focalLength;
        this.lensType=lensType;
        this.aperture=aperture;
        this.manufacturer=manufacturer;
    }

    public void displayLens() {
        System.out.println("*** Lens***");
        System.out.println("focal length: " + focalLength);
        System.out.println("lens type: " + lensType);
        System.out.println("aperture: " + aperture);
        System.out.println("manufacturer: " + manufacturer);
    }
}

class CameraDriver {
    public static void main(String[] args) {
        Camera camera = new Camera("Nikon", "F1", "45MP", 80000, "30x");

        camera.displayCamera();
        System.out.println();
        
        camera.lens.displayLens();
    }
}