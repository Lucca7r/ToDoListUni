package br.com.best.model;

import java.time.LocalDateTime;

public class Usuario {

    private Long userId;
    private String nickName;
    private String name;
    private String password;
    private LocalDateTime createdAt;

    public Usuario() {
    }

    public Usuario(Long userId, String nickName, String name, String password, LocalDateTime createdAt) {
        this.userId = userId;
        this.nickName = nickName;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setUser(String NickName) {
        this.nickName = NickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
