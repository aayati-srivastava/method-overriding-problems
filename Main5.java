// Base Admission class
class Admission {
    void admissionProcess() {
        System.out.println("General Admission Process");
    }
}

// UndergraduateAdmission subclass
class UndergraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

// PostgraduateAdmission subclass
class PostgraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

// Main class to test admission processes
public class Main5 {
    public static void main(String[] args) {
        Admission ugAdmission = new UndergraduateAdmission();
        Admission pgAdmission = new PostgraduateAdmission();

        ugAdmission.admissionProcess();
        pgAdmission.admissionProcess();
    }
}
