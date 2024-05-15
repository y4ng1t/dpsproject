const express = require('express');
const mysql = require('mysql');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const PORT = process.env.PORT || 5000;

// Middleware
app.use(bodyParser.json());
app.use(cors());
app.use(express.static('public'));

// MySQL connection
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root', // your MySQL username
  password: '', // your MySQL password
  database: 'facultyOfComputing' // the name of your database
});

db.connect(err => {
  if (err) {
    console.error('Error connecting to MySQL:', err);
    return;
  }
  console.log('MySQL connected');
});

// Routes
app.post('/api/form', (req, res) => {
  const { firstName, lastName, email, phone, message } = req.body;
  const sql = 'INSERT INTO forms (firstName, lastName, email, phone, message) VALUES (?, ?, ?, ?, ?)';
  db.query(sql, [firstName, lastName, email, phone, message], (err, result) => {
    if (err) {
      console.error('Error inserting form data:', err);
      res.status(500).json({ error: 'Database insertion error' });
      return;
    }
    res.status(201).json({ message: 'Form submitted successfully' });
  });
});

// Start the server
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
