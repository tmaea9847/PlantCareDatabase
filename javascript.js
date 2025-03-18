// JavaScript Document
function searchPlants() {
    let query = document.getElementById("plantSearch").value;
    if (query.length < 2) {
        document.getElementById("dropdown").style.display = "none";
        return;
    }

    fetch("http://localhost:8080/searchPlants?name=" + encodeURIComponent(query))
        .then(response => response.json())
        .then(data => {
            let dropdown = document.getElementById("dropdown");
            dropdown.innerHTML = "";
            dropdown.style.display = "block";

            if (data.length === 0) {
                dropdown.innerHTML = "<div>No results found</div>";
            } else {
                data.forEach(plant => {
                    let div = document.createElement("div");
                    div.textContent = plant.name;
                    div.onclick = function() {
                        showPlantDetails(plant);
                    };
                    dropdown.appendChild(div);
                });
            }
        })
        .catch(error => console.error("Error fetching data:", error));
}

function showPlantDetails(plant) {
    let detailsDiv = document.getElementById("plantDetails");
    document.getElementById("detailsContent").innerHTML = `
        <h3>${plant.name} (${plant.latinName})</h3>
        <p><strong>Origin:</strong> ${plant.plantSpecOrigin}</p>
        <p><strong>Family:</strong> ${plant.plantFamily}</p>
        <p><strong>Home Growth Rating:</strong> ${plant.ratingForHomeGrowth}</p>
        <p><strong>Propagation:</strong> ${plant.propagationMethod}</p>
        <p><strong>Care Instructions:</strong> ${plant.careInstructions}</p>
        <p><strong>Light Requirements:</strong> ${plant.lightRequirements}</p>
        <p><strong>Watering Schedule:</strong> ${plant.wateringSchedule}</p>
        <p><strong>Soil Requirements:</strong> ${plant.soilRequirements}</p>
    `;
    detailsDiv.style.display = "block";
}

function saveToLibrary() {
    alert("🌿 Plant has been saved to 'My Library'!");
}