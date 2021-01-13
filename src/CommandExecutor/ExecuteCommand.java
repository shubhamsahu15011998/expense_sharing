package CommandExecutor;

public interface ExecuteCommand {
    boolean validateCommand(String[] commandParts);
    boolean executeCommand(String[] commandParts);
    void showFailed();
}
