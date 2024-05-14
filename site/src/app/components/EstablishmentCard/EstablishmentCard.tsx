import { Star, StarHalf } from '@mui/icons-material';
import Carrosel from '../carrosel/Carrosel';
import styles from "./EstablishmentCard.module.scss"

export default function EstablishmentCard() {
    return (
        <div className={styles.container}>
            <div className={styles.container_carrosel}>
                <Carrosel />
            </div>
            <div>
                <p className={styles.container_sobre_titulo}>Título do Estabelecimento Aleatório</p>
                <p className={styles.principal_sobre_local} > <b style={{ fontSize: '15px' }}>Sobre:</b> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
                <p className={styles.principal_sobre_local} > <b style={{ fontSize: '15px' }}>Local:</b> Balbina, AM, Avenida Rio Negro, s/n Bloco Sala 05 .</p>

                <div style={{ display: 'flex', alignItems: 'center', fontSize: '20px', maxHeight: '5%' }}>
                    Nota:
                    <Star sx={{ fontSize: 20 }} />
                    <Star sx={{ fontSize: 20 }} />
                    <StarHalf sx={{ fontSize: 20 }} />
                </div>
            </div>
        </div>


    );
}
