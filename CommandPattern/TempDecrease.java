public class TempDecrease implements Command {
    private Thermostat thermostat;

    public TempDecrease(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    public String execute() {
        return thermostat.increase();
    }
}
