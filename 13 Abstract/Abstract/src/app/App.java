package app;

abstract class Database {
    abstract String getDatabaseApp();
    abstract String getDatabaseName();
    abstract String getTableName();
}

class MySQL extends Database {
    String getDatabaseApp() {
        return "MySQL DATABASE Server";
    }
    String getDatabaseName() {
        return "SIAK";
    }
    String getTableName() {
        return "Table Mahasiswa";
    }
}

class PostgreSQL extends Database {
    String getDatabaseApp() {
        return "PostgreSQL DATABASE Server";
    }
    String getDatabaseName() {
        return "Rumah Sakit";
    }
    String getTableName() {
        return "Table Pasien";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MySQL mysql = new MySQL();
        System.out.println(mysql.getDatabaseApp());
        System.out.println(mysql.getDatabaseName());
        System.out.println(mysql.getTableName());

        PostgreSQL psql = new PostgreSQL();
        System.out.println(psql.getDatabaseApp());
        System.out.println(psql.getDatabaseName());
        System.out.println(psql.getTableName());
    }
}