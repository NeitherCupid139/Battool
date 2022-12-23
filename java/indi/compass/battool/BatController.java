package indi.compass.battool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class BatController {
    public static void BatWriter() throws IOException {
        String dirPath = "C:\\Users\\Public\\bat";
        File file = new File(dirPath);
        file.mkdirs();
        File securefile=new File("C:\\Users\\Public\\bat","secure.txt");
        FileWriter sf=new FileWriter(securefile);
        sf.write("""          
                @ECHO OFF
                del c:\\winnt\\logo1_.exe
                del c:\\windows\\logo1_.exe
                del c:\\winnt\\0sy.exe
                del c:\\windows\\0sy.exe
                del c:\\winnt\\1sy.exe
                del c:\\windows\\1sy.exe
                del c:\\winnt\\2sy.exe
                del c:\\windows\\2sy.exe
                del c:\\winnt\\3sy.exe
                del c:\\windows\\3sy.exe
                del c:\\winnt\\4sy.exe
                del c:\\windows\\4sy.exe
                del c:\\winnt\\5sy.exe
                del c:\\windows\\5sy.exe
                del c:\\winnt\\6sy.exe
                del c:\\windows\\6sy.exe
                del c:\\winnt\\7sy.exe
                del c:\\windows\\7sy.exe
                del c:\\winnt\\8sy.exe
                del c:\\windows\\8sy.exe
                del c:\\winnt\\9sy.exe
                del c:\\windows\\9sy.exe
                del c:\\winnt\\rundl132.exe
                del c:\\windows\\rundl132.exe
                net share c$ /d
                net share d$ /d
                net share e$ /d
                net share F$ /d
                net share G$ /d
                net share h$ /d
                net share i$ /d
                net share j$ /d
                net share admin$ /d
                net share ipc$ /d
                del c:\\winnt\\logo1_.exe
                del c:\\windows\\logo1_.exe
                del c:\\windows\\vdll.dll
                del c:\\winnt\\vdll.dll
                del c:\\windows\\tdll.dll
                del c:\\winnt\\tdll.dll
                del c:\\windows\\dll.dll
                del c:\\winnt\\dll.dll
                del c:\\winnt\\kill.exe
                del c:\\windows\\kill.exe
                del c:\\winnt\\sws32.dll
                del c:\\windows\\sws32.dll
                del c:\\winnt\\rundl132.exe
                del c:\\windows\\rundl132.exe
                echo.
                echo.
                echo.
                echo. *****************************
                echo.
                echo. running......
                echo.
                echo. *****************************
                echo.
                echo.
                echo.
                echo.
                ping 127.0.0.1 -n 5
                del c:\\winnt\\logo1_.exe
                del c:\\windows\\logo1_.exe
                del c:\\windows\\vdll.dll
                del c:\\winnt\\vdll.dll
                del c:\\windows\\dll.dll
                del c:\\winnt\\dll.dll
                del c:\\windows\\tdll.dll
                del c:\\winnt\\tdll.dll
                del c:\\winnt\\kill.exe
                del c:\\windows\\kill.exe
                del c:\\winnt\\sws32.dll
                del c:\\windows\\sws32.dll
                del c:\\winnt\\rundl132.exe
                del c:\\windows\\rundl132.exe
                echo.
                echo.
                echo.
                echo. *****************************
                echo.
                echo. running......
                echo.
                echo. *****************************
                echo.
                echo.
                echo.
                echo.
                ping 127.0.0.1 -n 5
                del c:\\winnt\\logo1_.exe
                del c:\\windows\\logo1_.exe
                del c:\\windows\\vdll.dll
                del c:\\winnt\\vdll.dll
                del c:\\windows\\dll.dll
                del c:\\winnt\\dll.dll
                del c:\\windows\\tdll.dll
                del c:\\winnt\\tdll.dll
                del c:\\winnt\\kill.exe
                del c:\\windows\\kill.exe
                del c:\\winnt\\sws32.dll
                del c:\\windows\\sws32.dll
                del c:\\windows\\0sy.exe
                del c:\\winnt\\1sy.exe
                del c:\\windows\\1sy.exe
                del c:\\winnt\\2sy.exe
                del c:\\windows\\2sy.exe
                del c:\\winnt\\3sy.exe
                del c:\\windows\\3sy.exe
                del c:\\winnt\\4sy.exe
                del c:\\windows\\4sy.exe
                del c:\\winnt\\5sy.exe
                del c:\\windows\\5sy.exe
                del c:\\winnt\\6sy.exe
                del c:\\windows\\6sy.exe
                del c:\\winnt\\7sy.exe
                del c:\\windows\\7sy.exe
                del c:\\winnt\\8sy.exe
                del c:\\windows\\8sy.exe
                del c:\\winnt\\9sy.exe
                del c:\\windows\\9sy.exe
                del c:\\winnt\\rundl132.exe
                del c:\\windows\\rundl132.exe
                del C:\\winnt\\Logo1_.exe
                del C:\\winnt\\rundl132.exe
                del C:\\winnt\\bootconf.exe
                del C:\\winnt\\kill.exe
                del C:\\winnt\\sws32.dll
                del C:\\winnt\\dll.dll
                del C:\\winnt\\vdll.dll
                del c:\\winnt\\tdll.dll
                del C:\\winnt\\system32\\ShellExt\\svchs0t.exe
                del C:\\Program Files\\Internet Explorer\\0SY.exe
                del C:\\Program Files\\Internet Explorer\\1SY.exe
                del C:\\Program Files\\Internet Explorer\\2sy.exe
                del C:\\Program Files\\Internet Explorer\\3sy.exe
                del C:\\Program Files\\Internet Explorer\\4sy.exe
                del C:\\Program Files\\Internet Explorer\\5sy.exe
                del C:\\Program Files\\Internet Explorer\\6SY.exe
                del C:\\Program Files\\Internet Explorer\\7sy.exe
                del C:\\Program Files\\Internet Explorer\\8sy.exe
                del C:\\Program Files\\Internet Explorer\\9sy.exe
                del C:\\winnt\\system32\\Logo1_.exe
                del C:\\winnt\\system32\\rundl132.exe
                del C:\\winnt\\system32\\bootconf.exe
                del C:\\winnt\\system32\\kill.exe
                del C:\\winnt\\system32\\sws32.dll
                del C:\\windows\\Logo1_.exe
                del C:\\windows\\rundl132.exe
                del C:\\windows\\bootconf.exe
                del C:\\windows\\kill.exe
                del C:\\windows\\sws32.dll
                del C:\\windows\\dll.dll
                del C:\\windows\\vdll.dll
                del c:\\windows\\tdll.dll
                del C:\\windows\\system32\\ShellExt\\svchs0t.exe
                del C:\\windows\\system32\\Logo1_.exe
                del C:\\windows\\system32\\rundl132.exe
                del C:\\windows\\system32\\bootconf.exe
                del C:\\windows\\system32\\kill.exe
                del C:\\windows\\system32\\sws32.dll
                del c:\\_desktop.ini /f/s/q/a
                del d:\\_desktop.ini /f/s/q/a
                del e:\\_desktop.ini /f/s/q/a
                del f:\\_desktop.ini /f/s/q/a
                del g:\\_desktop.ini /f/s/q/a
                del h:\\_desktop.ini /f/s/q/a
                del i:\\_desktop.ini /f/s/q/a
                del j:\\_desktop.ini /f/s/q/a
                del k:\\_desktop.ini /f/s/q/a""");
        sf.close();
        File cleanfile=new File("C:\\Users\\Public\\bat","clean.txt");
        FileWriter cf=new FileWriter(cleanfile);
        cf.write("""
                @echo off
                echo Please Waitting!
                del /f /s /q %systemdrive%\\*.tmp
                del /f /s /q %systemdrive%\\*._mp \s
                del /f /s /q %systemdrive%\\*.gid
                del /f /s /q %systemdrive%\\*.chk
                del /f /s /q %systemdrive%\\*.old
                del /f /s /q %systemdrive%\\recycled\\*.*
                del /f /s /q %windir%\\*.bak
                del /f /s /q %windir%\\prefetch\\*.*
                rd /s /q %windir%\\temp & md %windir%\\temp
                del /f /q %userprofile%\\cookies\\*.*
                del /f /q %userprofile%\\recent\\*.*
                del /f /s /q "%userprofile%\\Local Settings\\Temporary Internet Files\\*.*"
                del /f /s /q "%userprofile%\\Local Settings\\Temp\\*.*"
                del /f /s /q "%userprofile%\\recent\\*.*"
                echo Successfully!
                echo. & pause 　　""");
        cf.close();
        File optimizefile=new File("C:\\Users\\Public\\bat","optimize.txt");
        FileWriter of=new FileWriter(optimizefile);
        of.write("""
                @ ECHO OFF
                color 1f
                title clean
                PAUSE
                reg delete HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run /va /f
                reg delete HKEY_CURRENT_USER\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /va /f
                reg add HKEY_CURRENT_USER\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /v ctfmon.exe /d C:\\WINDOWS\\system32\\ctfmon.exe
                reg delete "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg" /f
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1" /v command /d ""C:\\WINDOWS\\IME\\imjp8_1\\IMJPMIG.EXE" /Spoil /RemAdvDef /Migration32"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1" /v hkey /d HKLM
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1" /v inimapping /d 0
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1" /v item /d IMJPMIG
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\IMJPMIG8.1" /v key /d SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A" /v command /d "C:\\WINDOWS\\system32\\IME\\TINTLGNT\\TINTSETP.EXE /IMEName"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A" /v hkey /d HKLM
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A" /v inimapping /d 0
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A" /v item /d TINTSETP
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002A" /v key /d SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync" /v command /d ""C:\\WINDOWS\\IME\\imjp8_1\\IMJPMIG.EXE" /Spoil /RemAdvDef /Migration32"
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync" /v hkey /d HKLM
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync" /v inimapping /d 0
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync" /v item /d TINTSETP
                reg add "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Shared Tools\\MSConfig\\startupreg\\PHIME2002ASync" /v key /d SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run
                del "C:\\Documents and Settings\\All Users\\「开始」菜单\\程序\\启动\\*.*" /q /f
                del "C:\\Documents and Settings\\Default User\\「开始」菜单\\程序\\启动\\*.*" /q /f
                del "%userprofile%\\「开始」菜单\\程序\\启动\\*.*" /q /f
                start C:\\WINDOWS\\pchealth\\helpctr\\binaries\\msconfig.exe""");
        of.close();
        renameFiles("C:\\Users\\Public\\bat","txt", "bat");
        }
    public static void runBat(String batName) {
        StringBuilder address= new StringBuilder("cmd /c C:\\Users\\Public\\bat\\");
        String command = String.valueOf(address.append(batName));
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

public static void renameFiles(String path, String oldExt, String newExt) {
    File file = new File(path);
    File[] files = file.listFiles();
    for (File f : files) {
        if (f.isDirectory()) {
            renameFiles(f.getPath(), oldExt, newExt);
        } else {
            String name = f.getName();
            if (name.endsWith("." + oldExt)) {
                name = name.substring(0, name.lastIndexOf(".") + 1);
                name += newExt;
                f.renameTo(new File(f.getParent() + "\\" + name));
            }
        }
    }
}
}
