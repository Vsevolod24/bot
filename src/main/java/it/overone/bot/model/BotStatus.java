package it.overone.bot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "Bot_status")
public class BotStatus {

    @Id
    public String Id;

    public String status;

    public String chatId;

}
