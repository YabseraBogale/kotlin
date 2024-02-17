// best way to hide it is to put in home/username/ and hide then forget about
import  java.sql.DriverManager
fun main() {
    val jdbcUrl = "jdbc:postgresql://localhost:5432/dummy"

    // get the connection
    val connection = DriverManager
        .getConnection(jdbcUrl, "postgres", "Deathandlife13579")
    println(connection.isValid(0))
}