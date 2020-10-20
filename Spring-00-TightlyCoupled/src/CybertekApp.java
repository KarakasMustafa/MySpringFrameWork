public class CybertekApp {

    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        partTimeMentor partTimeMentor = new partTimeMentor();

        Mentor mentor = new Mentor(fullTimeMentor,partTimeMentor);
        mentor.manageAccount();
    }
}
