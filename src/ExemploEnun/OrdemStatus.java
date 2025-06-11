package ExemploEnun;

import java.util.Date;

public class OrdemStatus {
    private Long id;
    private Date dataHora;
    private Status status;

    public OrdemStatus() {
    }

    public OrdemStatus(Long id, Date dataHora, Status status) {
        this.id = id;
        this.dataHora = dataHora;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdemStatus{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", status=" + status +
                '}';
    }
}
