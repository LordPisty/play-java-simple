package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by screspi on 8/22/14.
 */
@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;
}
