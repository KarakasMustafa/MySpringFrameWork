public class Mentor {

    FullTimeMentor fullTimeMentor;
    partTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, partTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}
