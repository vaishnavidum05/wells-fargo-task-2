package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sessionDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "counselor_id")
    private Counselor counselor;

    public Session(Long id, String sessionDate, User user, Counselor counselor) {
        this.id = id;
        this.sessionDate = sessionDate;
        this.user = user;
        this.counselor = counselor;
    }

    public Session() {}

    public Long getId() { return id; }

    public String getSessionDate() { return sessionDate; }
    public void setSessionDate(String sessionDate) { this.sessionDate = sessionDate; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Counselor getCounselor() { return counselor; }
    public void setCounselor(Counselor counselor) { this.counselor = counselor; }
}
