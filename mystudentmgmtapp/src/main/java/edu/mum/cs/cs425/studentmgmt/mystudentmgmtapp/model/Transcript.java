package edu.mum.cs.cs425.studentmgmt.mystudentmgmtapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;
    @NotBlank
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript")
    private Student student;


    public Transcript() {
    }
    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
