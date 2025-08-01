// Andriely Alejandro Casallas Calderon copyrigth 2025

package src;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Docente
        Docente[] docentes = {
            new Docente(
            1,
            "Juan Pérez",
            "jperez@unisalle.edu.co",
            "Matemáticas",
            "1234567890",
            "Matemáticas Avanzadas",
            "Doctor en Matematicas",
            5000.00,
            20,
            LocalDate.of(2025, 7, 31)
            ),
            new Docente(
            2,
            "Ana Gómez",
            "agomez@unisalle.edu.co",
            "Historia",
            "0987654321",
            "Historia Moderna",
            "Máster en Historia",
            4500.00,
            15,
            LocalDate.of(2023, 1, 15)
            ),
            new Docente(
            3,
            "Carlos Rojas",
            "carlosrojas@unisalle.edu.co",
            "Física",
            "2345678901",
            "Física Cuántica",
            "Doctor en Física Nuclear",
            5200.00,
            18,
            LocalDate.of(2024, 3, 12)
            ),
            new Docente(
            4,
            "María López",
            "mlopez@unisalle.edu.co",
            "Biología",
            "3456789012",
            "Genética",
            "Doctor en Biología Molecular",
            4800.00,
            22,
            LocalDate.of(2022, 11, 5)
            ),
            new Docente(
            5,
            "Roberto Jiménez",
            "rjimenez@unisalle.edu.co",
            "Química",
            "4567890123",
            "Química Orgánica",
            "Máster en Química",
            4600.00,
            25,
            LocalDate.of(2023, 9, 18)
            ),
            new Docente(
            6,
            "Laura Méndez",
            "lauram@unisalle.edu.co",
            "Informática",
            "5678901234",
            "Inteligencia Artificial",
            "Doctor en Ciencias Computacionales",
            5500.00,
            30,
            LocalDate.of(2021, 5, 22)
            ),
            new Docente(
            7,
            "Diego Ramírez",
            "dramirez@unisalle.edu.co",
            "Inglés",
            "6789012345",
            "Lingüística",
            "Máster en Lenguas Modernas",
            4200.00,
            15,
            LocalDate.of(2024, 1, 30)
            ),
            new Docente(
            8,
            "Sofía Herrera",
            "sherrera@unisalle.edu.co",
            "Arte",
            "7890123456",
            "Arte Contemporáneo",
            "Doctor en Historia del Arte",
            4100.00,
            18,
            LocalDate.of(2025, 12, 14)
            ),
            new Docente(
            9,
            "Jorge Castro",
            "jcastro@unisalle.edu.co",
            "Filosofía",
            "8901234567",
            "Ética",
            "Doctor en Filosofía",
            4300.00,
            20,
            LocalDate.of(2023, 4, 9)
            ),
            new Docente(
            10,
            "Valeria Navarro",
            "vnavarro@unisalle.edu.co",
            "Economía",
            "9012345678",
            "Macroeconomía",
            "Máster en Economía",
            4700.00,
            22,
            LocalDate.of(2022, 7, 31)
            ),
            new Docente(
            11,
            "Andrés Morales",
            "amorales@unisalle.edu.co",
            "Ingeniería Civil",
            "0123456789",
            "Estructuras",
            "Doctor en Ingeniería",
            5800.00,
            28,
            LocalDate.of(2019, 6, 15)
            ),
            new Docente(
            12,
            "Camila Vega",
            "cvega@unisalle.edu.co",
            "Medicina",
            "1234509876",
            "Anatomía",
            "Doctor en Medicina",
            6000.00,
            35,
            LocalDate.of(2018, 3, 10)
            ),
            new Docente(
            13,
            "Fernando Guzmán",
            "fguzman@unisalle.edu.co",
            "Derecho",
            "2345610987",
            "Derecho Penal",
            "Doctor en Derecho",
            5300.00,
            25,
            LocalDate.of(2042, 9, 12)
            ),
            new Docente(
            14,
            "Gabriela Solís",
            "gsolis@unisalle.edu.co",
            "Psicología",
            "3456721098",
            "Psicología Clínica",
            "Máster en Psicología",
            4400.00,
            20,
            LocalDate.of(2024, 2, 28)
            ),
            new Docente(
            15,
            "Ricardo Monge",
                "rmonge@unisalle.edu.co",
                "Robótica",
                "4567832109",
                "Automatización",
                "Doctor en Robótica",
                6200.00,
                32,
                LocalDate.of(2020, 10, 5)
            ),
            new Docente(
                16,
                "Isabel Chinchilla",
                "ichinchilla@unisalle.edu.co",
                "Literatura",
                "5678943210",
                "Literatura Latina",
                "Doctor en Letras",
                3900.00,
                16,
                LocalDate.of(2023, 8, 17)
            ),
            new Docente(
                17,
                "Hugo Barrantes",
                "hbarrantes@unisalle.edu.co",
                "Astronomía",
                "6789054321",
                "Cosmología",
                "Doctor en Astrofísica",
                5400.00,
                24,
                LocalDate.of(2022, 4, 3)
            ),
            new Docente(
                18,
                "Daniela Ríos",
                "drios@unisalle.edu.co",
                "Bioquímica",
                "7890165432",
                "Enzimología",
                "Doctor en Bioquímica",
                5100.00,
                26,
                LocalDate.of(2021, 12, 1)
            ),
            new Docente(
                19,
                "Pablo Cordero",
                "pcordero@unisalle.edu.co",
                "Música",
                "8901276543",
                "Composición",
                "Máster en Música",
                3800.00,
                12,
                LocalDate.of(2024, 5, 19)
            ),
            new Docente(
                20,
                "Xinia Alvarado",
                "xalvarado@unisalle.edu.co",
                "Ecología",
                "9012387654",
                "Conservación",
                "Doctor en Ciencias Ambientales",
                4900.00,
                19,
                LocalDate.of(2019, 7, 8)
            )
        };

        for (Docente profesor : docentes) {
            System.out.println("Datos del Docente:");
            System.out.println("-----------------------");
            profesor.mostrarDatos();
            System.out.println("-----------------------");
        }
    }
}