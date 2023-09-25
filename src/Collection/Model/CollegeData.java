package Collection.Model;

public class CollegeData {
    Integer CollegeCode;
    String ITTeacherName;
    String ElectricalTeacherName;
    String MechanicalTeacherName;
    String PCTeacherName;

    public CollegeData(Integer collegeCode, String ITTeacherName, String electricalTeacherName, String mechanicalTeacherName, String PCTeacherName) {
        CollegeCode = collegeCode;
        this.ITTeacherName = ITTeacherName;
        ElectricalTeacherName = electricalTeacherName;
        MechanicalTeacherName = mechanicalTeacherName;
        this.PCTeacherName = PCTeacherName;
    }


    public Integer getCollegeCode() {
        return CollegeCode;
    }

    public void setCollegeCode(Integer collegeCode) {
        CollegeCode = collegeCode;
    }

    public String getITTeacherName() {
        return ITTeacherName;
    }

    public void setITTeacherName(String ITTeacherName) {
        this.ITTeacherName = ITTeacherName;
    }

    public String getElectricalTeacherName() {
        return ElectricalTeacherName;
    }

    public void setElectricalTeacherName(String electricalTeacherName) {
        ElectricalTeacherName = electricalTeacherName;
    }

    public String getMechanicalTeacherName() {
        return MechanicalTeacherName;
    }

    public void setMechanicalTeacherName(String mechanicalTeacherName) {
        MechanicalTeacherName = mechanicalTeacherName;
    }

    public String getPCTeacherName() {
        return PCTeacherName;
    }

    public void setPCTeacherName(String PCTeacherName) {
        this.PCTeacherName = PCTeacherName;
    }
}
