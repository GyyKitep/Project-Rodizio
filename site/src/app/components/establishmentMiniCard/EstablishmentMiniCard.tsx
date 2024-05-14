import Image from "next/image";
import styles from "./EstablishmentMiniCard.module.scss"

export default function EstablishmentMiniCard() {

    const image = "https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg";

    return(
        <div className={styles.container}>
            <Image src={image} alt="imagem restaurante" width={200} height={200} className={styles.establishment_image}/>
            <h1>Titulo - estrelas</h1>
        </div>


    );
}