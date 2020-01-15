package exercises.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(getNumberOfCredits())
    {
        // Determine the grade level of the student based on numberOfCredits
        //returns the student’s level based on the number of credits they have earned:
        if (numberOfCredits < 30) {         //Freshman (0-29 credits)
            return "Freshman";
        } else if (numberOfCredits < 60){   //Sophomore (30-59 credits)
            return "Sophomore";
        } else if (numberOfCredits <90){    //Junior (60-89 credits)
            return "Junior";
        } else {                            //Senior (90+ credits)
            return "Senior";
        }
    }


    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // This method accepts two parameters—a number of course credits and a numerical grade (0.0-4.0).
        // With this data, you need to update the student’s GPA.
        //          gpa = (total quality score) / (total number of credits)
        //                (total quality score) = gpa * (total number of credits)
        //          quality score for a class = letter grade score (0.0-4.0) * number of credits.
        //          total quality score = sum of the quality scores for all classes.
        // if a student received an “A” (worth 4 points) in a 3-credit course and a “B” (worth 3 points) in a 4-credit course,
        // their total quality score would be: 4.0 * 3 + 3.0 * 4 = 24. Their GPA would then be 24 / 7 = 3.43.

        // Determine and update the student’s GPA:
        //      Calculate their current total quality score by using the formula gpa * numberOfCredits.
        double totalQualityScore = getGPA() * getNumberOfCredits()
        //      Use the new course grade and course credits to update their total quality score.
        double classQualityScore = courseCredits * grade;
        totalQualityScore = totalQualityScore + classQualityScore
        //      Update the student’s total numberOfCredits.
        setNumberOfCredits(getNumberOfCredits() + courseCredits);
        //      Compute their new GPA.
        setGpa( totalQualityScore / getNumberOfCredits() );

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
