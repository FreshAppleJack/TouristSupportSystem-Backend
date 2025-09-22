package com.cdut.touristsupportsystem.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName scenemapleading
 */
@TableName(value ="scenemapleading")
public class scenemapleading {
    /**
     * 
     */
    private String sceneName;

    /**
     * 
     */
    private String sceneAddress;

    /**
     * 
     */
    private Integer sceneId;

    /**
     * 
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * 
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    /**
     * 
     */
    public String getSceneAddress() {
        return sceneAddress;
    }

    /**
     * 
     */
    public void setSceneAddress(String sceneAddress) {
        this.sceneAddress = sceneAddress;
    }

    /**
     * 
     */
    public Integer getSceneId() {
        return sceneId;
    }

    /**
     * 
     */
    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        scenemapleading other = (scenemapleading) that;
        return (this.getSceneName() == null ? other.getSceneName() == null : this.getSceneName().equals(other.getSceneName()))
            && (this.getSceneAddress() == null ? other.getSceneAddress() == null : this.getSceneAddress().equals(other.getSceneAddress()))
            && (this.getSceneId() == null ? other.getSceneId() == null : this.getSceneId().equals(other.getSceneId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSceneName() == null) ? 0 : getSceneName().hashCode());
        result = prime * result + ((getSceneAddress() == null) ? 0 : getSceneAddress().hashCode());
        result = prime * result + ((getSceneId() == null) ? 0 : getSceneId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sceneName=").append(sceneName);
        sb.append(", sceneAddress=").append(sceneAddress);
        sb.append(", sceneId=").append(sceneId);
        sb.append("]");
        return sb.toString();
    }
}