import Image from "next/image";

export default function Galeria() {
    const data = [
        {
          id: "1",
          image:
            "https://www.cnnbrasil.com.br/viagemegastronomia/wp-content/uploads/sites/5/2022/08/votre-brasserie.jpeg?w=1024&h=674&crop=1",
        },
        {
          id: "2",
          image:
            "https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg",
        },
        {
          id: "3",
          image:
            "https://www.cnnbrasil.com.br/viagemegastronomia/wp-content/uploads/sites/5/2022/08/votre-brasserie.jpeg?w=1024&h=674&crop=1",
        },
        {
          id: "4",
          image:
            "https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg",
        }
      ];

    return (
        <div style={{display:"grid", gridTemplateColumns: "40% 60%"}}>
         <img
            src={data[1].image}
            alt="imagem do restaurante"
            width={100}
            style={{objectFit:"cover"}}
          />       
            <img
            src={data[2].image}
            alt="imagem do restaurante"
            width={100}
            style={{objectFit:"cover"}}
          />             
        
        
        </div>
    )
}