package com.encapsulation1.internal2;




    public class Garage {
        private String name = "City Auto Garage";
        private String location = "koppa";
        private int capacity = 20;
        private boolean hasWashingService = true;
        private String owner = "Ramesh";

        void setName(String name) {
            this.name = name;
        }

        void setLocation(String location) {
            this.location = location;
        }

        void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void setHasWashingService(boolean hasWashingService) {
            this.hasWashingService = hasWashingService;
        }

        void setOwner(String owner) {
            this.owner = owner;
        }

        public String getName() {
            return this.name;
        }

        public String getLocation() {
            return this.location;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public boolean getHasWashingService() {
            return this.hasWashingService;
        }

        public String getOwner() {
            return this.owner;
        }
    }



