import java.sql.*
import java.util.*

object MySQLDatabaseExampleKotlin {
    private var conn: Connection? = null
    private const val username = "root"
    private const val password = "1234"
    @JvmStatic fun main(args: Array<String>) {
        getConnection()
        executeMySQLQuery()
    }
    private fun executeMySQLQuery() {
        var stmt: Statement? = null
        var resultset: ResultSet? = null
        try {
            stmt = conn!!.createStatement()
            resultset = stmt!!.executeQuery("SELECT name from v\$database")
            while (resultset!!.next()) {
                println(resultset.getString("Database"))
            }
        } catch (ex: SQLException) {

            ex.printStackTrace()
        } finally {

            if (resultset != null) {
                try {
                    resultset.close()
                } catch (sqlEx: SQLException) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close()
                } catch (sqlEx: SQLException) {
                }
            }
            if (conn != null) {
                try {
                    conn!!.close()
                } catch (sqlEx: SQLException) {
                }
                conn = null
            }
        }
    }

    private fun getConnection() {
        val connectionProps = Properties()
        connectionProps["user"] = username
        connectionProps["password"] = password
        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
            conn = DriverManager.getConnection(
                "jdbc:" + "mysql" + "://" +
                        "127.0.0.1" +
                        ":" + "3306" + "/" +
                        "",
                connectionProps)
        } catch (ex: SQLException) {

            ex.printStackTrace()
        } catch (ex: Exception) {

            ex.printStackTrace()
        }
    }
}