package House;

public class Houses {
    private int floors;
    private int rooms;
    private boolean isGarage;

    @Override
    public String toString() {
        return "Houses{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", isGarage=" + isGarage +
                '}';
    }

    public Houses(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.isGarage = builder.isGarage;
    }

    public static class Builder {
        private int floors;
        private int rooms;
        private boolean isGarage;

        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder isGarage(boolean isGarage) {
            this.isGarage = isGarage;
            return this;

        }

        public Houses build() {
            return new Houses(this);
        }
    }

}
