public class Exam extends Grades {
    public void registGradeToSubject(String subject, int grade) {
        // if(super.grade.get(super.subject.indexOf(subject)) == null) {
        //     super.grade.add(super.subject.indexOf(subject), grade);
        // } else {
        //     super.grade.set(super.subject.indexOf(subject), grade);
        // }
        super.grade.set(super.subject.indexOf(subject), grade);
    }
}
