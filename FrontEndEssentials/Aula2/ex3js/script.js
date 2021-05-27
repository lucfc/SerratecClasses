var dados;
function fetchData() {
    console.log("Iniciei");
    var xhr = new XMLHttpRequest();

    xhr.open('GET', 'https://api.rawg.io/api/games?key=ec01ab7e989a453d91e17e1c5913871e&page_size=4&metacritic=97,100');
    xhr.send();

    xhr.onreadystatechange = () => {

        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                //    console.log(JSON.parse(xhr.responseText));
                console.log("Encontrei dados");
                dados = JSON.parse(xhr.responseText).results;
                console.log(dados);
                document.getElementById('container').innerHTML =
                    dados.map(element => {
                        return `
            <div>
                <h1>${element.name}</h1>
                <p>${element.metacritic}</p>
                <p>${element.slug}</p>
                <p>${element.platforms.map(elemento => {
                    return `
                        <span>${elemento.platform.name}</span>
                    `
                })}<p>
                <img src="${element.background_image}" style="width: 600px; border-radius:50%"/>
                <button id="teste" onclick="openModal(${element.id})">Click Me !</button>
            </div>
            `
                    })
            }
        };
    }
}

function openModal(id) {
    console.log("Iniciei");
    var xhr = new XMLHttpRequest();

    xhr.open('GET', `https://api.rawg.io/api/games/${id}?key=ec01ab7e989a453d91e17e1c5913871e`);
    xhr.send();

    xhr.onreadystatechange = () => {

        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                //    console.log(JSON.parse(xhr.responseText));
                console.log("Encontrei dados");
                dados = JSON.parse(xhr.responseText);
                console.log(dados);

                document.getElementById('container').innerHTML = 
                `
                <h2>Descrição</h2>
                <p>
                ${dados.metacritic}
                </p>
                <img src="${dados.background_image}" style="width: 400px;height:400px">
                `
                
                    }
            }
        }
    }
