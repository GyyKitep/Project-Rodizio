import Cabecalho from "@/app/components/cabecalho/Cabecalho";
import { Paper, Rating, TextField, Typography } from "@mui/material";
import EstablishmentCard from "@/app/components/EstablishmentCard/EstablishmentCard";
import styles from "./Page.module.scss"
import Combobox from "@/app/components/combobox/Combobox";
import Avaliacao from "@/app/components/avaliacao/Avaliacao";

export default function establishments() {

    return (
        <>
            <Cabecalho />
            <Paper
                sx={{
                    p: 6,
                    background: '#737373',
                    height: '100%',
                    margin: '1rem 10rem',
                    borderRadius: 2,
                }}
            >
                <div style={{ display: "block" }}>
                    <TextField id="filled-basic" label="Nome do Resturante" variant="filled" style={{ background: "rgb(255, 250, 250)", width: "100%"}} />
                    <Combobox/>
                    <Avaliacao/> 
                </div>
                <div className={styles.container_establishment_card}>
                    <EstablishmentCard />
                </div>
                <div className={styles.container_establishment_card}>
                    <EstablishmentCard />
                </div>
                <div className={styles.container_establishment_card}>
                    <EstablishmentCard />
                </div>
                <div className={styles.container_establishment_card}>
                    <EstablishmentCard />
                </div>

            </Paper>
        </>

    )

}