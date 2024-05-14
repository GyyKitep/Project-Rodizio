import { Paper } from "@mui/material";
import Cabecalho from "./components/cabecalho/Cabecalho";
import styles from "./Page.module.scss"
import EstablishmentMiniCard from "./components/establishmentMiniCard/EstablishmentMiniCard";
import EstablishmentCard from "./components/EstablishmentCard/EstablishmentCard";



export default function Home() {
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

        <div style={{ paddingBottom: '20px' }}>
          <EstablishmentCard />
        </div>
        <div className={styles.secundario_container}>

          <div className={styles.secundario_container_item}>
            <EstablishmentMiniCard />
          </div>
          <div className={styles.secundario_container_item}>
            <EstablishmentMiniCard />
          </div>
          <div className={styles.secundario_container_item}>
            <EstablishmentMiniCard />
          </div>
          <div className={styles.secundario_container_item}>
            <EstablishmentMiniCard />
          </div>
        </div>
      </Paper >
    </>
  )
}