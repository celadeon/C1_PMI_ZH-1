import java.util.ArrayList;

public class Grades {
    protected ArrayList<String> subject = new ArrayList<>();
    protected ArrayList<Integer> grade = new ArrayList<>();


    public void addSubject(String subject) {
        this.subject.add(subject);
        this.grade.add(-1);
    }

    public void dropSubject(String subject) {
        this.grade.remove(this.subject.indexOf(subject));
        this.subject.remove(subject);
    }

    public String getGrades() {
        String result = "";

        for(int i = 0; i < this.subject.size(); i++) {
            result += this.subject.get(i);

            if(i == this.subject.size() -1) {
                if(this.grade.get(i) == -1) {
                    result += " -";
                } else {
                    result += " " + this.grade.get(i);
                }
            } else {
                if(this.grade.get(i) == -1) {
                    result += " -\r\n";
                } else {
                    result += " " + this.grade.get(i)+"\r\n";
                }
            }

        }

        return result;
    }
}
