package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int calssRoomId;
    @NotBlank
    private String buildingNmae;
    @NotBlank
    private String roomNumber;
    @OneToMany(mappedBy = "classRoom",cascade = CascadeType.PERSIST)
    private List<Student> student;

    public ClassRoom() {
    }

    public ClassRoom( String buildingNmae, String roomNumber) {
        this.calssRoomId = calssRoomId;
        this.buildingNmae = buildingNmae;
        this.roomNumber = roomNumber;
    }

    public ClassRoom(@NotBlank String buildingNmae, @NotBlank String roomNumber, List<Student> student) {
        this.buildingNmae = buildingNmae;
        this.roomNumber = roomNumber;
        this.student = student;
    }

    public void setCalssRoomId(int calssRoomId) {
        this.calssRoomId = calssRoomId;
    }

    public void setBuildingNmae(String buildingNmae) {
        this.buildingNmae = buildingNmae;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCalssRoomId() { return calssRoomId; }

    public String getBuildingNmae() {
        return buildingNmae;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public List<Student> getStudent() { return student;}

    public void setStudent(List<Student> student) { this.student = student; }

    public void addStudent(List<Student>student) {
        this.student=student;
        for(Student st:student){
            st.setClassRoom(this);
        }
    }
}
