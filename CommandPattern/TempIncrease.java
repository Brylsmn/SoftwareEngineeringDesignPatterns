public class TempIncrease implements Command {
    private Thermostat thermostat;

    public TempIncrease(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    public String execute() {
        return thermostat.increase();
    }
}
