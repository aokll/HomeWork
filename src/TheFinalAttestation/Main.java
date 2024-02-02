package TheFinalAttestation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BackupCopy backupCopy = new BackupCopy();
        backupCopy.toCreateAFileAndCopyFiles("1111");
        backupCopy.toCreateAFileAndCopyFiles("2222");
    }
}
