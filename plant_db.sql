USE plant_db;

CREATE TABLE plants (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    latinName VARCHAR(150),
    plantSpecOrigin VARCHAR(150),
    plantFamily VARCHAR(100),
    ratingForHomeGrowth VARCHAR(50),
    propagationMethod VARCHAR(100),
    careInstructions TEXT,
    lightRequirements VARCHAR(100),
    wateringSchedule VARCHAR(100),
    soilRequirements VARCHAR(100)
);

-- Test option

INSERT INTO plants (name, latinName, plantSpecOrigin, plantFamily, ratingForHomeGrowth, propagationMethod, careInstructions, lightRequirements, wateringSchedule, soilRequirements)
VALUES 
('Fiddleleaf Fig', 'Ficus lyrata', 'West Africa', 'Moraceae', 'Medium', 'Stem Cuttings', 'Water when top 2 inches of soil are dry', 'Bright, indirect light', 'Once a week', 'Well-draining, rich soil'),

('Pothos', 'Epipremnum aureum', 'Solomon Islands', 'Araceae', 'Easy', 'Stem Cuttings', 'Water when soil is dry', 'Low to bright indirect light', 'Every 1-2 weeks', 'Well-draining soil'),

('Snake Plant', 'Sansevieria trifasciata', 'West Africa', 'Asparagaceae', 'Very Easy', 'Leaf Cuttings, Division', 'Water sparingly, let soil dry completely', 'Low to bright indirect light', 'Every 2-3 weeks', 'Well-draining, sandy soil'),

('Split-Leaf Philodendron', 'Monstera deliciosa', 'Central America', 'Araceae', 'Medium', 'Stem Cuttings', 'Water when top inch of soil is dry', 'Bright, indirect light', 'Once a week', 'Well-draining, peat-based soil');

SELECT * FROM plants;



INSERT INTO plants (name, latinName, plantSpecOrigin, plantFamily, ratingForHomeGrowth, propagationMethod, careInstructions, lightRequirements, wateringSchedule, soilRequirements) 
VALUES 
("Spider Plant", "Chlorophytum comosum", "South Africa", "Liliaceae", "Easy", "Offsets", "Water every 2 weeks", "Indirect sunlight", "Every 14 days", "Well-draining soil");

SELECT * FROM plants;
