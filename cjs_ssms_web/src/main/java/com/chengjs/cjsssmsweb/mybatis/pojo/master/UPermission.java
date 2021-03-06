package com.chengjs.cjsssmsweb.mybatis.pojo.master;

import java.util.Date;
import javax.persistence.*;

@Table(name = "u_permission")
public class UPermission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT replace(t.uuid,\"-\",\"\") FROM (SELECT uuid() uuid FROM dual) t")
    private String id;

    @Column(name = "pername")
    private String pername;

    @Column(name = "description")
    private String description;

    @Column(name = "createtime")
    private Date createtime;

    @Column(name = "modifytime")
    private Date modifytime;

    @Column(name = "discard")
    private String discard;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return pername
     */
    public String getPername() {
        return pername;
    }

    /**
     * @param pername
     */
    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return modifytime
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * @param modifytime
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * @return discard
     */
    public String getDiscard() {
        return discard;
    }

    /**
     * @param discard
     */
    public void setDiscard(String discard) {
        this.discard = discard == null ? null : discard.trim();
    }
}