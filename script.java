function chooseOption(option) {
    const sceneImage = document.getElementById("scene-image");
    const storyText = document.getElementById("story-text");
    const choices = document.getElementById("choices");

    if (option === 'cenaAssassinato') {
        sceneImage.src = "img/cena_assassinato.jpg";
        storyText.innerHTML = "<p>Na cena do crime, você encontra uma pista: uma luva ensanguentada. O que fazer agora?</p>";
        choices.innerHTML = `
            <button onclick="chooseOption('coletarEvidencia')">Coletar Evidência</button>
            <button onclick="chooseOption('investigarSuspeito')">Interrogar Suspeito</button>
        `;
    } else if (option === 'escritorioSuspeito') {
        sceneImage.src = "img/escritorio_suspeito.jpg";
        storyText.innerHTML = "<p>Você encontra documentos suspeitos no escritório. Decida se deseja continuar vasculhando ou sair para outra investigação.</p>";
        choices.innerHTML = `
            <button onclick="chooseOption('vasculharMais')">Vasculhar Mais</button>
            <button onclick="chooseOption('sair')">Sair</button>
        `;
    } else if (option === 'coletarEvidencia') {
        sceneImage.src = "img/laboratorio.jpg";
        storyText.innerHTML = "<p>Você envia a luva para análise no laboratório. A análise revela impressões digitais do principal suspeito. O que fazer agora?</p>";
        choices.innerHTML = `
            <button onclick="chooseOption('interrogarSuspeito')">Interrogar Suspeito</button>
            <button onclick="chooseOption('seguirPista')">Seguir outra Pista</button>
        `;
    } else if (option === 'investigarSuspeito') {
        sceneImage.src = "img/interrogatorio.jpg";
        storyText.innerHTML = "<p>Durante o interrogatório, o suspeito parece nervoso. Ele não consegue explicar onde estava na noite do crime.</p>";
        choices.innerHTML = `
            <button onclick="chooseOption('confrontarSuspeito')">Confrontar Suspeito com a Evidência</button>
            <button onclick="chooseOption('seguirOutraPista')">Seguir outra pista</button>
