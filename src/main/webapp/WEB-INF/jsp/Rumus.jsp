<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kalkulator Persegi</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; }
        .form-group { margin-bottom: 15px; }
        label { display: inline-block; width: 80px; }
        input[type="number"] { padding: 5px; width: 150px; }
        button { padding: 6px 15px; background-color: #007bff; color: white; border: none; cursor: pointer; border-radius: 3px; }
        button:hover { background-color: #0056b3; }
        .result-box { margin-top: 20px; padding: 15px; background-color: #f8f9fa; border: 1px solid #ddd; width: 300px; }
    </style>
</head>
<body>

    <h2>Form Input Perhitungan Persegi</h2>

    <!-- Form Mengirimkan Data ke URL /rumus dengan metode GET -->
    <form action="/rumus" method="GET">
        <div class="form-group">
            <label for="panjang">Panjang:</label>
            <input type="number" id="panjang" name="panjang" value="${panjang}" required>
        </div>

        <div class="form-group">
            <label for="lebar">Lebar:</label>
            <input type="number" id="lebar" name="lebar" value="${lebar}" required>
        </div>

        <button type="submit">Cek / Hitung</button>
    </form>

    <!-- Menampilkan Hasil Jika Data Sudah Ditentukan -->
    <% if (request.getAttribute("isValid") != null) { %>
        <div class="result-box">
            <h3>Hasil Perhitungan</h3>
            <p>Panjang: <strong>${panjang}</strong></p>
            <p>Lebar: <strong>${lebar}</strong></p>
            <p>Apakah Persegi Valid? <strong>${isValid}</strong></p>
        </div>
    <% } %>

</body>
</html>