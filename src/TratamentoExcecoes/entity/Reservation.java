package TratamentoExcecoes.entity;

import TratamentoExcecoes.Exception.ErrorException;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static final LocalDateTime sistemaDate = LocalDateTime.now();

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public Boolean validation(LocalDateTime checkIn, LocalDateTime checkOut){
        this.checkIn =checkIn;
        this.checkOut =checkOut;
        if(checkIn.isBefore(sistemaDate)){
            throw new ErrorException("data não ser igual ou anterior atual");
        }else if (checkOut.isBefore(checkIn)){
          throw new ErrorException("data fim não ser igual ou anterior date de inicio");
        }
        return true;
    }

    public Long duration(LocalDateTime checkIn, LocalDateTime checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;

        if (validation(checkIn,checkOut)){
            Duration duration = Duration.between(checkIn,checkOut);
            return duration.toDays();
        }
        return null;
    }

    public void UpdateDate(LocalDateTime checkIn, LocalDateTime checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        System.out.println("informação atualizada!");
    }

    @Override
    public String toString() {
        return "Informações da reserva: "+
                "Quarto: "+roomNumber+
                ", Data Inicio: "+formatter.format(checkIn)+
                ", Data Fim: "+formatter.format(checkOut)+
                ", dias reservados: "+ duration(getCheckIn(),getCheckOut());
    }
}
