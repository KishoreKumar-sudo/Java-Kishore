public class Engineer {
    void work() {
        System.out.println("Engineer works");
    }

    class MechanicalEngineer extends Engineer {
        void work() {
            System.out.println("MechanicalEngineer works");
        }
    }
    class ElectricalEngineer extends Engineer {
        void work() {
            System.out.println("ElectricalEngineer works");
        }
    }
    class SoftwareEngineer extends Engineer {
        void work() {
            System.out.println("SoftwareEngineer works");
        }
    }
}
